package com.coffeepoweredcrew.objectpool;

public class Client {

	public static ObjectPool<Image> imageCachedPool = new ObjectPool<>(()->new Bitmap("png"), 2);
    public static void main(String[] args) {
    		
    	Image bitmap1 =  imageCachedPool.get();
    	bitmap1.setLocation(new Point2D(55, 55));
    	bitmap1.draw();
    	
    	Image bitmap2 =  imageCachedPool.get();
    	bitmap2.setLocation(new Point2D(25, 25));
    	bitmap2.draw();
    	
    	System.out.println(bitmap1 == bitmap2); //false
    	
    	imageCachedPool.release(bitmap1);
    	imageCachedPool.release(bitmap2);
    	
    	Image bitmap3 =  imageCachedPool.get();
    	bitmap2.setLocation(new Point2D(20, 20));
    	bitmap2.draw();
    }
}
