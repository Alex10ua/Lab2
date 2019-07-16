package com.company;

public class Triangle
{
    Double sideA;
    Double sideB;
    Double sideC;

    public Triangle(Double sideA, Double sideB, Double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    Double getPerimetr()
    {
        return sideA+sideB+sideC;
    }
    Double getArea()
    {
        return sideA*sideB/2;
    }
    Boolean isValid()
    {
        Boolean result=true;
        if ((sideA+sideB)>sideC)
            result =true;
        else result=false;
        return result;
    }
}
