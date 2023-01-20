package com.promineotech.jeep.controller.support;

public class CreateOrderTestSupport extends BaseTest{
  
  protected String createOrderBody() {
    //@formatter:off
    return "{\n"
        + "  \"customer\":\"CSASZAR_IRENE\",\n"
        + "  \"model\":\"WRANGLER\",\n"
        + "  \"trim\":\"Islander\",\n"
        + "  \"doors\":4,\n"
        + "  \"color\":\"EXT_SLATE_BLUE\",\n"
        + "  \"engine\":\"2_0_TURBO\",\n"
        + "  \"tire\":\"35_NITTO\",\n"
        + "  \"options\":[\n"
        + "    \"DOOR_QUAD_4\",\n"
        + "    \"EXT_AEV_LIFT\",\n"
        + "    \"EXT_WARN_WINCH\",\n"
        + "    \"EXT_WARN_BUMPER_FRONT\",\n"
        + "    \"EXT_WARN_BUMPER_REAR\",\n"
        + "    \"EXT_ARB_COMPRESSOR\"\n"
        + "  ]\n"
        + "}";
    //@formatter:on
  }

}
