package Overriding;

 class AdvancedCalculator extends Calculator {
    public int add(int a , int b) {
        System.out.println("Tam ədədlərin əlavə edilməsi üçün AdvancedCalculator-dan istifadə.");
        return super.add(a,b);
    }
}
