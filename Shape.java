class Shape {
    
    int getCorner() {
        return 1;
    }
}

class Rectangler extends Shape {

    int getCorner() {
        return 4;
    }

    int getParentCorner() {
        return super.getCorner();
    }
}