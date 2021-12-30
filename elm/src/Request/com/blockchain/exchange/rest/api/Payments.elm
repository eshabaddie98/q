{-
   Blockchain.com Exchange REST API
   ## Introduction Welcome to Blockchain.com's Exchange API and developer documentation. \\ These documents detail and give examples of various functionality offered by the API such as receiving real time market data, requesting balance information and performing trades. ## To Get Started Create or log into your existing Blockchain.com Exchange account \\ Select API from the drop down menu \\ Fill out form and click “Create New API Key Now” \\ Once generated you can view your keys under API Settings. \\ Please be aware that the API key can only be used once it was verified via email.  The API key must be set via the \\ `X-API-Token`\\ header.  The base URL to be used for all calls is \\ `https://api.blockchain.com/v3/exchange`  Autogenerated clients for this API can be found [here](https://github.com/blockchain/lib-exchange-client). 

   The version of the OpenAPI document: 1.0.0

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git
   Do not edit this file manually.
-}


module Request.Payments exposing (createWithdrawal, getAccountByTypeAndCurrency, getAccounts, getDepositAddress, getDepositById, getDeposits, getWhitelist, getWhitelistByCurrency, getWithdrawalById, getWithdrawals)

import Data.WhitelistEntry as WhitelistEntry exposing (WhitelistEntry)
import Data.WithdrawalInfo as WithdrawalInfo exposing (WithdrawalInfo)
import Data.DepositInfo as DepositInfo exposing (DepositInfo)
import Data.DepositAddressCrypto as DepositAddressCrypto exposing (DepositAddressCrypto)
import Data.CreateWithdrawalRequest as CreateWithdrawalRequest exposing (CreateWithdrawalRequest)
import Data.Balance as Balance exposing (Balance)
import Data.BalanceMap as BalanceMap exposing (BalanceMap)
import Dict
import Http
import Json.Decode as Decode
import Url.Builder as Url




basePath : String
basePath =
    "https://api.blockchain.com/v3/exchange"


{-| Call `GET /whitelist` first to retrieve the ID of the beneficiary. To add a beneficiary to the whitelist, please visit the profile page in the Exchange. This call only works if 2FA is enabled on the account.
-}
createWithdrawal :
    { onSend : Result Http.Error WithdrawalInfo -> msg


    , body : CreateWithdrawalRequest


    }
    -> Cmd msg
createWithdrawal params =
    Http.request
        { method = "POST"
        , headers = List.filterMap identity []
        , url = Url.crossOrigin basePath
            ["withdrawals"]
            (List.filterMap identity [])
        , body = Http.jsonBody <| CreateWithdrawalRequest.encode params.body
        , expect = Http.expectJson params.onSend WithdrawalInfo.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


getAccountByTypeAndCurrency :
    { onSend : Result Http.Error Balance -> msg



    , account : String    , currency : String

    }
    -> Cmd msg
getAccountByTypeAndCurrency params =
    Http.request
        { method = "GET"
        , headers = List.filterMap identity []
        , url = Url.crossOrigin basePath
            ["accounts", identity params.account, identity params.currency]
            (List.filterMap identity [])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend Balance.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


getAccounts :
    { onSend : Result Http.Error BalanceMap -> msg





    }
    -> Cmd msg
getAccounts params =
    Http.request
        { method = "GET"
        , headers = List.filterMap identity []
        , url = Url.crossOrigin basePath
            ["accounts"]
            (List.filterMap identity [])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend BalanceMap.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


getDepositAddress :
    { onSend : Result Http.Error DepositAddressCrypto -> msg



    , currency : String

    }
    -> Cmd msg
getDepositAddress params =
    Http.request
        { method = "POST"
        , headers = List.filterMap identity []
        , url = Url.crossOrigin basePath
            ["deposits", identity params.currency]
            (List.filterMap identity [])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend DepositAddressCrypto.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


getDepositById :
    { onSend : Result Http.Error DepositInfo -> msg



    , depositId : String

    }
    -> Cmd msg
getDepositById params =
    Http.request
        { method = "GET"
        , headers = List.filterMap identity []
        , url = Url.crossOrigin basePath
            ["deposits", identity params.depositId]
            (List.filterMap identity [])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend DepositInfo.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


getDeposits :
    { onSend : Result Http.Error (List DepositInfo) -> msg




    , from : Maybe (Int)    , to : Maybe (Int)
    }
    -> Cmd msg
getDeposits params =
    Http.request
        { method = "GET"
        , headers = List.filterMap identity []
        , url = Url.crossOrigin basePath
            ["deposits"]
            (List.filterMap identity [Maybe.map (Url.string "from" << String.fromInt) params.from, Maybe.map (Url.string "to" << String.fromInt) params.to])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend (Decode.list DepositInfo.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }


getWhitelist :
    { onSend : Result Http.Error (List WhitelistEntry) -> msg





    }
    -> Cmd msg
getWhitelist params =
    Http.request
        { method = "GET"
        , headers = List.filterMap identity []
        , url = Url.crossOrigin basePath
            ["whitelist"]
            (List.filterMap identity [])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend (Decode.list WhitelistEntry.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }


getWhitelistByCurrency :
    { onSend : Result Http.Error (List WhitelistEntry) -> msg



    , currency : String

    }
    -> Cmd msg
getWhitelistByCurrency params =
    Http.request
        { method = "GET"
        , headers = List.filterMap identity []
        , url = Url.crossOrigin basePath
            ["whitelist", identity params.currency]
            (List.filterMap identity [])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend (Decode.list WhitelistEntry.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }


getWithdrawalById :
    { onSend : Result Http.Error WithdrawalInfo -> msg



    , withdrawalId : String

    }
    -> Cmd msg
getWithdrawalById params =
    Http.request
        { method = "GET"
        , headers = List.filterMap identity []
        , url = Url.crossOrigin basePath
            ["withdrawals", identity params.withdrawalId]
            (List.filterMap identity [])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend WithdrawalInfo.decoder
        , timeout = Just 30000
        , tracker = Nothing
        }


getWithdrawals :
    { onSend : Result Http.Error (List WithdrawalInfo) -> msg




    , from : Maybe (Int)    , to : Maybe (Int)
    }
    -> Cmd msg
getWithdrawals params =
    Http.request
        { method = "GET"
        , headers = List.filterMap identity []
        , url = Url.crossOrigin basePath
            ["withdrawals"]
            (List.filterMap identity [Maybe.map (Url.string "from" << String.fromInt) params.from, Maybe.map (Url.string "to" << String.fromInt) params.to])
        , body = Http.emptyBody
        , expect = Http.expectJson params.onSend (Decode.list WithdrawalInfo.decoder)
        , timeout = Just 30000
        , tracker = Nothing
        }
