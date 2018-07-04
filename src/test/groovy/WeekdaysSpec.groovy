import spock.lang.Specification

class WeekdaysSpec extends Specification {
  def "not all weekdays created equal"() {
    setup:
    def weekday = Weekdays.MONDAY
    expect:
    weekday != Weekdays.TUESDAY
  }
}
