package isp.segregated;

public interface LibraryMembershipProvider {
  void join(String borrower);
  void leave(String borower);
}
