public interface Scalable {
    /**
     * TODO: Uniformly scales the shape by the given positive factor.
     * e.g., factor 2.0 doubles linear dimensions; 0.5 halves them.
     * Precondition: factor > 0
     */
    void scale(double factor);
}
