代理模式
案例背景：某家电商平台，需要对接银行完成支付模块的功能，由于该平台没有支付资格，故通过对接第三方支付公司进行支付。
银行：可以看成目标对象，具有渠道支付能力。
第三方支付公司：可以看成代理对象，代理银行的支付能力。
电商平台：需要对接第三方支付公司。

包结构说明：
static(静态代理)、dynamic(动态代理)、cglib(子类代理)