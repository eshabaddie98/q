# coding: utf-8

"""
    Blockchain.com Exchange REST API

    ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. \\ These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account \\ Select API from the drop down menu \\ Fill out form and click “Create New API Key Now” \\ Once generated you can view your keys under API Settings. \\ Please be aware that the API key can only be used once it was verified via email.  The API key must be set via the \\ `X-API-Token`\\ header.  The base URL to be used for all calls is \\ `https://api.blockchain.com/v3/exchange`  Autogenerated clients for this API can be found [here](https://github.com/blockchain/lib-exchange-client).   # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest

import openapi_client
from com.blockchain.exchange.rest.api.unauthenticated_api import UnauthenticatedApi  # noqa: E501
from openapi_client.rest import ApiException


class TestUnauthenticatedApi(unittest.TestCase):
    """UnauthenticatedApi unit test stubs"""

    def setUp(self):
        self.api = com.blockchain.exchange.rest.api.unauthenticated_api.UnauthenticatedApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_get_l2_order_book(self):
        """Test case for get_l2_order_book

        L2 Order Book  # noqa: E501
        """
        pass

    def test_get_l3_order_book(self):
        """Test case for get_l3_order_book

        L3 Order Book  # noqa: E501
        """
        pass

    def test_get_symbol_by_name(self):
        """Test case for get_symbol_by_name

        Symbols  # noqa: E501
        """
        pass

    def test_get_symbols(self):
        """Test case for get_symbols

        Symbols  # noqa: E501
        """
        pass

    def test_get_ticker_by_symbol(self):
        """Test case for get_ticker_by_symbol

        Price  # noqa: E501
        """
        pass

    def test_get_tickers(self):
        """Test case for get_tickers

        Price  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
