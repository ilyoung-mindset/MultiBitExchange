package org.multibit.exchange.infrastructure.adaptor.p2p;

import org.multibit.exchange.domainmodel.Trade;

/**
 * <p>[Pattern] to provide the following to {@link Object}:</p>
 * <ul>
 * <li></li>
 * </ul>
 * <p>Example:</p>
 * <pre>
 * </pre>
 *
 * @since 0.0.1
 *         
 */
public interface TradeHandler {
  void handleTrade(Trade trade);
}
